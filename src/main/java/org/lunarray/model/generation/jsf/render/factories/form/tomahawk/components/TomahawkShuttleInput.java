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
package org.lunarray.model.generation.jsf.render.factories.form.tomahawk.components;

import javax.faces.component.UIInput;

import org.apache.myfaces.custom.picklist.HtmlSelectManyPicklist;
import org.lunarray.model.descriptor.model.property.PropertyDescriptor;
import org.lunarray.model.generation.jsf.render.RenderContext;
import org.lunarray.model.generation.jsf.render.factories.form.FormPropertyRenderStrategy;
import org.lunarray.model.generation.jsf.render.factories.form.jsf.components.AbstractRelationPropertyRenderStrategy;
import org.lunarray.model.generation.jsf.render.factories.form.tomahawk.TomahawkStyleClasses;

/**
 * Tomahawk shuttle component.
 * 
 * @author Pal Hargitai (pal@lunarray.org)
 * @param <P>
 *            The property type.
 * @param <E>
 *            The entity type.
 */
public final class TomahawkShuttleInput<P, E>
		extends AbstractRelationPropertyRenderStrategy<P, E> {

	/**
	 * Default constructor.
	 * 
	 * @param jsfContext
	 *            The context.
	 */
	protected TomahawkShuttleInput(final RenderContext jsfContext) {
		super(jsfContext);
	}

	/** {@inheritDoc} */
	@Override
	protected UIInput createInput(final PropertyDescriptor<P, E> property, final RenderContext renderContext) {
		final HtmlSelectManyPicklist input = new HtmlSelectManyPicklist();
		input.setStyleClass(renderContext.resolveStyleClass(TomahawkStyleClasses.FORM_INPUT_SHUTTLE));
		return input;
	}

	/**
	 * A factory.
	 * 
	 * @author Pal Hargitai (pal@lunarray.org)
	 */
	public static final class FactoryImpl
			implements Factory {

		/**
		 * Default constructor.
		 */
		public FactoryImpl() {
			// Default constructor.
		}

		/** {@inheritDoc} */
		@Override
		public <P, E> FormPropertyRenderStrategy<P, E> createStrategy(final RenderContext context) {
			return new TomahawkShuttleInput<P, E>(context);
		}
	}
}
