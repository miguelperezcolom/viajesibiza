package io.mateu.viajesibiza.admin;

import io.mateu.erp.client.financial.FinancialServiceAsync;
import io.mateu.erp.model.authentication.User;
import io.mateu.erp.shared.financial.FinancialService;
import io.mateu.ui.core.client.app.*;
import io.mateu.ui.core.client.components.fields.DateField;
import io.mateu.ui.core.client.views.AbstractDialog;
import io.mateu.ui.core.shared.Data;
import io.mateu.ui.mdd.client.MDDOpenEditorAction;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Reports extends AbstractModule {
    @Override
    public String getName() {
        return "Reports";
    }

    @Override
    public List<MenuEntry> getMenu() {
        List<MenuEntry> m = new ArrayList<>();

        m.add(new AbstractAction("Reprice") {
            @Override
            public void run() {
                MateuUI.openView(new AbstractDialog() {
                    @Override
                    public void onOk(Data data) {
                        ((FinancialServiceAsync)MateuUI.create(FinancialService.class)).reprice(MateuUI.getApp().getUserData(), data.getLocalDate("from"), data.getLocalDate("to"), new Callback<>());
                    }

                    @Override
                    public String getTitle() {
                        return "Reprice";
                    }

                    @Override
                    public void build() {
                        add(new DateField("from", "From")).add(new DateField("to", "To"));
                    }
                });
            }
        });

        m.add(new AbstractAction("General report") {
            @Override
            public void run() {
                MateuUI.openView(new AbstractDialog() {
                    @Override
                    public void onOk(Data data) {
                        ((FinancialServiceAsync)MateuUI.create(FinancialService.class)).generalReport(data.getLocalDate("from"), data.getLocalDate("to"), new Callback<URL>() {
                            @Override
                            public void onSuccess(URL result) {
                                MateuUI.open(result);
                            }
                        });
                    }

                    @Override
                    public String getTitle() {
                        return "General report";
                    }

                    @Override
                    public void build() {
                        add(new DateField("from", "From")).add(new DateField("to", "To"));
                    }
                });
            }
        });

        m.add(new AbstractAction("Export to Beroni") {
            @Override
            public void run() {
                MateuUI.openView(new AbstractDialog() {
                    @Override
                    public void onOk(Data data) {
                        ((FinancialServiceAsync)MateuUI.create(FinancialService.class)).exportToBeroni(data.getLocalDate("from"), data.getLocalDate("to"), new Callback<>());
                    }

                    @Override
                    public String getTitle() {
                        return "Reprice";
                    }

                    @Override
                    public void build() {
                        add(new DateField("from", "From")).add(new DateField("to", "To"));
                    }
                });
            }
        });

        return m;
    }
}