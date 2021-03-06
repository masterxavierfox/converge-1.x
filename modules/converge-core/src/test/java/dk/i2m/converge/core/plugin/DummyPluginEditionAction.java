/*
 * Copyright (C) 2014 Allan Lykke Christensen
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package dk.i2m.converge.core.plugin;

import dk.i2m.converge.core.annotations.OutletAction;
import dk.i2m.converge.core.content.NewsItemPlacement;
import dk.i2m.converge.core.workflow.Edition;
import dk.i2m.converge.core.workflow.OutletEditionAction;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Dummy Plug-in Edition Action.
 *
 * @author Allan Lykke Christensen
 */
@OutletAction
public class DummyPluginEditionAction implements EditionAction {

    @Override
    public void execute(PluginContext ctx, Edition edition, OutletEditionAction action) {
    }

    @Override
    public void executePlacement(PluginContext ctx, NewsItemPlacement placement, Edition edition, OutletEditionAction action) {
    }

    @Override
    public boolean isSupportEditionExecute() {
        return false;
    }

    @Override
    public boolean isSupportPlacementExecute() {
        return false;
    }

    @Override
    public Map<String, String> getAvailableProperties() {
        return Collections.EMPTY_MAP;
    }

    @Override
    public String getName() {
        return "Dummy Plugin Edition Action";
    }

    @Override
    public String getDescription() {
        return "This is a dummy plugin edition action";
    }

    @Override
    public String getVendor() {
        return "GetConverge.com";
    }

    @Override
    public Date getDate() {
        return Calendar.getInstance().getTime();
    }

    @Override
    public ResourceBundle getBundle() {
        return ResourceBundle.getBundle("dk.i2m.converge.core.plugin.DummyPluginEditionActionMessages");
    }

    @Override
    public String getAbout() {
        return "This is a dummy plugin edition action";
    }

}
