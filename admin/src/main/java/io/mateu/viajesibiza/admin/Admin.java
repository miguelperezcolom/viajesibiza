package io.mateu.viajesibiza.admin;

import io.mateu.erp.model.authentication.User;
import io.mateu.erp.model.config.AppConfig;
import io.mateu.erp.model.partners.Actor;
import io.mateu.erp.model.workflow.AbstractTask;
import io.mateu.erp.model.world.City;
import io.mateu.ui.core.client.app.AbstractModule;
import io.mateu.ui.core.client.app.MateuUI;
import io.mateu.ui.core.client.app.MenuEntry;
import io.mateu.ui.mdd.client.MDDAction;
import io.mateu.ui.mdd.client.MDDOpenEditorAction;

import java.util.ArrayList;
import java.util.List;

public class Admin extends AbstractModule {
    @Override
    public String getName() {
        return "Admin";
    }

    @Override
    public List<MenuEntry> buildMenu() {
        List<MenuEntry> m = new ArrayList<>();

        m.add(new MDDAction("Users", User.class));
        m.add(new MDDAction("Actors", Actor.class));
        m.add(new MDDAction("Cities", City.class));
        if ("admin".equalsIgnoreCase(MateuUI.getApp().getUserData().getLogin())) {
            m.add(new MDDOpenEditorAction("AppConfig", AppConfig.class, 1l));

            m.add(new MDDAction("Queue", AbstractTask.class));
        }


        return m;
    }
}