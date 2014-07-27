/* 
 * Model Tools.
 * Copyright (C) 2013 Pal Hargitai (pal@lunarray.org)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.lunarray.model.generation.jsf.render.factories.datatable.tomahawk;

import org.apache.myfaces.component.html.ext.HtmlDataTable;
import org.apache.myfaces.custom.datascroller.HtmlDataScroller;
import org.lunarray.model.generation.jsf.render.JsfStyleClasses;
import org.lunarray.model.generation.jsf.render.RenderContext;
import org.lunarray.model.generation.jsf.render.factories.datatable.AbstractDataTableBuilder;

/**
 * The tomahawk builder.
 * 
 * @author Pal Hargitai (pal@lunarray.org)
 */
public final class TomahawkDataTableBuilder
		extends AbstractDataTableBuilder {

	/**
	 * Default constructor.
	 */
	public TomahawkDataTableBuilder() {
		super();
	}

	/** {@inheritDoc} */
	@Override
	public HtmlDataTable build(final RenderContext renderContext) {
		final HtmlDataTable table = new HtmlDataTable();
		table.setStyleClass(renderContext.resolveStyleClass(JsfStyleClasses.TABLE_OUTPUT));
		table.getChildren().addAll(this.getColumns());
		table.getFooter().getChildren().add(new HtmlDataScroller());
		return table;
	}
}
