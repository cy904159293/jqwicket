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
package com.google.code.jqwicket.dnd;


import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;

import com.google.code.jqwicket.ui.draggable.DraggableBehavior;
import com.google.code.jqwicket.ui.draggable.DraggableOptions;

/**
 * Base abstract panel for draggable components.
 * 
 * @author mkalina
 * 
 */
public abstract class DraggablePanel extends Panel {

	private static final long serialVersionUID = 1L;

	public DraggablePanel(String id, IModel<?> model) {
		super(id, model);
		super.add(new DraggableBehavior(newDraggableOptions()));
	}

	public DraggablePanel(String id) {
		super(id);
		super.add(new DraggableBehavior(newDraggableOptions()));
	}

	protected DraggableOptions newDraggableOptions() {
		return new DraggableOptions().appendTo("body").helper("clone");
	}

}
