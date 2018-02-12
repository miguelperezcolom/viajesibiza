package io.mateu.viajesibiza.admin;

import com.google.common.collect.Lists;
import io.mateu.ui.core.client.app.AbstractModule;

import java.util.List;

public class Area extends io.mateu.ui.core.client.app.AbstractArea {
    public Area() {
        super("Admin");
    }

    @Override
    public List<AbstractModule> getModules() {
        return Lists.newArrayList(new Booking(), new Producto(), new Reports(), new Admin());
    }
}
