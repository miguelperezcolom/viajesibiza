package io.mateu.viajesibiza.admin;

import io.mateu.erp.client.booking.PickupConfirmationView;
import io.mateu.erp.client.booking.TransfersSummaryView;
import io.mateu.erp.model.booking.transfer.TransferPointMapping;
import io.mateu.erp.model.booking.transfer.TransferService;
import io.mateu.ui.core.client.app.AbstractAction;
import io.mateu.ui.core.client.app.AbstractModule;
import io.mateu.ui.core.client.app.MateuUI;
import io.mateu.ui.core.client.app.MenuEntry;
import io.mateu.ui.mdd.client.MDDAction;

import java.util.ArrayList;
import java.util.List;

public class Confirm extends AbstractModule {
    @Override
    public String getName() {
        return "Confirm";
    }

    @Override
    public List<MenuEntry> buildMenu() {
        List<MenuEntry> m = new ArrayList<>();

        m.add(new AbstractAction("Pickup confirmation") {
            @Override
            public void run() {
                MateuUI.openView(new PickupConfirmationView());
            }
        });

        return m;
    }
}