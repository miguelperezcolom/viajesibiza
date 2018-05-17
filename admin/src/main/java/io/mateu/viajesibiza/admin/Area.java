package io.mateu.viajesibiza.admin;

import com.google.common.collect.Lists;
import io.mateu.ui.core.client.app.AbstractModule;
import io.mateu.ui.core.client.app.MateuUI;

import java.util.ArrayList;
import java.util.List;

public class Area extends io.mateu.ui.core.client.app.AbstractArea {
    public Area() {
        super("Admin");

        setPublicAccess(false);
    }

    @Override
    public List<AbstractModule> getModules() {
        List<AbstractModule> l = super.getModules();
        if (!MateuUI.hasPermission(1)) l = Lists.newArrayList(l.get(1));
        return l;
    }

    @Override
    public List<AbstractModule> buildModules() {
        List<AbstractModule> l = Lists.newArrayList(new Booking(), new Confirm(), new Producto(), new Reports(), new Admin());
        return l;
    }
}
