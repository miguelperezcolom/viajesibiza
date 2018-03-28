package io.mateu.viajesibiza.admin;

import io.mateu.erp.model.authentication.User;
import io.mateu.erp.model.product.transfer.*;
import io.mateu.ui.core.client.app.AbstractModule;
import io.mateu.ui.core.client.app.MenuEntry;
import io.mateu.ui.mdd.client.MDDAction;
import io.mateu.ui.mdd.client.MDDOpenEditorAction;

import java.util.ArrayList;
import java.util.List;

public class Producto extends AbstractModule {
    @Override
    public String getName() {
        return "Product";
    }

    @Override
    public List<MenuEntry> buildMenu() {
        List<MenuEntry> m = new ArrayList<>();

        m.add(new MDDAction("Transfer points", TransferPoint.class));

        m.add(new MDDAction("Contracts", Contract.class));

        m.add(new MDDAction("Prices", Price.class));

        m.add(new MDDAction("Vehicles", Vehicle.class));

        m.add(new MDDAction("Price zones", Zone.class));


        return m;
    }
}