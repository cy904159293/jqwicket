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
package net.javaforge.jqwicket.ui.dialog;

import net.javaforge.jqwicket.IJQUIWidget;
import net.javaforge.jqwicket.JQFunction;

import org.apache.wicket.ajax.AjaxRequestTarget;

/**
 * @author mkalina
 *
 */
public interface IDialog extends IJQUIWidget<DialogOptions> {

	/**
	 * Method to open the dialog
	 * 
	 * @return the associated JsStatement
	 */
	JQFunction open();

	/**
	 * Method to open the dialog within the ajax request
	 * 
	 * @param ajaxRequestTarget
	 */
	void open(AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Method to close the dialog
	 * 
	 * @return the associated JsStatement
	 */
	JQFunction close();

	/**
	 * Method to close the dialog within the ajax request
	 * 
	 * @param ajaxRequestTarget
	 */
	void close(AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Method returning true if the dialog is currently open
	 * 
	 * @return the associated JsStatement
	 */
	JQFunction isOpen();

	/**
	 * Method returning true if the dialog is currently open
	 * 
	 * @param ajaxRequestTarget
	 */
	void isOpen(AjaxRequestTarget ajaxRequestTarget);

	/**
	 * Method to move to top the dialog
	 * 
	 * @return the associated JsStatement
	 */
	JQFunction moveToTop();

	/**
	 * Method to move to top the dialog within the ajax request
	 * 
	 * @param ajaxRequestTarget
	 */
	void moveToTop(AjaxRequestTarget ajaxRequestTarget);
}
