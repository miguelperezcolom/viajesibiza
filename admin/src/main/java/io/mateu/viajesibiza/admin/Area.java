package io.mateu.viajesibiza.admin;

import com.google.common.collect.Lists;
import io.mateu.ui.core.client.app.AbstractModule;
import io.mateu.ui.core.client.app.MateuUI;

import java.util.List;

public class Area extends io.mateu.ui.core.client.app.AbstractArea {
    public Area() {
        super("Admin");
    }

    @Override
    public List<AbstractModule> getModules() {
        List<AbstractModule> l = Lists.newArrayList(new Booking(), new Producto(), new Reports(), new Admin());
        if (MateuUI.hasPermission(1)) l = Lists.newArrayList(new Booking(), new Producto(), new Reports(), new Admin());
        return l;
    }
}
