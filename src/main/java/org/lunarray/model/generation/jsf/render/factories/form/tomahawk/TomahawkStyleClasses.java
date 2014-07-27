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
package org.lunarray.model.generation.jsf.render.factories.form.tomahawk;

import org.lunarray.model.generation.jsf.render.StyleClasses;

/**
 * The style classes for tomahawk.
 * 
 * @author Pal Hargitai (pal@lunarray.org)
 */
public enum TomahawkStyleClasses implements StyleClasses {

	/** Form input style for dates. */
	FORM_INPUT_DATE("form.input.date", "mg_th_form_input_date"),
	/** Form input style for date times. */
	FORM_INPUT_DATE_TIME("form.input.date.time", "mg_th_form_input_date_time"),
	/** Form input style for rich input. */
	FORM_INPUT_RICH("form.input.rich", "mg_th_form_input_irch"),
	/** Form input style for shuttles. */
	FORM_INPUT_SHUTTLE("form.input.shuttle", "mg_th_form_input_shuttle"),
	/** Form input style for times. */
	FORM_INPUT_TIME("form.input.time", "mg_th_form_input_time");

	/** The default value. */
	private String defaultValue;
	/** The lookup key. */
	private String key;

	/**
	 * Default constructor.
	 * 
	 * @param key
	 *            The key.
	 * @param defaultValue
	 *            The default value.
	 */
	private TomahawkStyleClasses(final String key, final String defaultValue) {
		this.key = key;
		this.defaultValue = defaultValue;
	}

	/**
	 * Gets the value for the defaultValue field.
	 * 
	 * @return The value for the defaultValue field.
	 */
	@Override
	public String getDefaultValue() {
		return this.defaultValue;
	}

	/**
	 * Gets the value for the key field.
	 * 
	 * @return The value for the key field.
	 */
	@Override
	public String getKey() {
		return this.key;
	}
}
