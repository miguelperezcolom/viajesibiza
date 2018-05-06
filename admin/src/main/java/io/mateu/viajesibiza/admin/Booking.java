package io.mateu.viajesibiza.admin;

import io.mateu.erp.client.booking.PickupTimeImportingView;
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

public class Booking extends AbstractModule {
    @Override
    public String getName() {
        return "Booking";
    }

    @Override
    public List<MenuEntry> buildMenu() {
        List<MenuEntry> m = new ArrayList<>();

        m.add(new AbstractAction("Transfers summary") {
            @Override
            public void run() {
                MateuUI.openView(new TransfersSummaryView(), isModifierPressed());
            }
        });

        m.add(new MDDAction("Bookings", TransferService.class));

        m.add(new MDDAction("Mapping", TransferPointMapping.class));

        m.add(new AbstractAction("Upload pickup times") {
            @Override
            public void run() {
                MateuUI.openView(new PickupTimeImportingView(), isModifierPressed());
            }
        });

        return m;
    }
}