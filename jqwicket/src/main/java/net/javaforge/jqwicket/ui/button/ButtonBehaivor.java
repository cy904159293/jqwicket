/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.javaforge.jqwicket.ui.button;

import net.javaforge.jqwicket.JQFunction;
import net.javaforge.jqwicket.ui.JQUIComponentBehaivor;

import org.apache.wicket.ajax.AjaxRequestTarget;

/**
 * @author mkalina
 *
 */
public class ButtonBehaivor extends JQUIComponentBehaivor<ButtonOptions>
		implements IButton {

	private static final long serialVersionUID = 1L;

	private static final String JQ_COMPONENT_NAME = "button";

	public ButtonBehaivor() {
		this(new ButtonOptions());
	}

	public ButtonBehaivor(ButtonOptions options) {
		super(options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.JQUIWidget#getName()
	 */
	public String getName() {
		return JQ_COMPONENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.button.IButton#refresh()
	 */
	public JQFunction refresh() {
		return chain("'refresh'");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.ui.button.IButton#refresh(org.apache.wicket.ajax.AjaxRequestTarget)
	 */
	public void refresh(AjaxRequestTarget ajaxRequestTarget) {
		chain(ajaxRequestTarget, this.refresh());
	}

}