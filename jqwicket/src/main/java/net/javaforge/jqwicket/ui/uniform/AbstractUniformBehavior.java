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
package net.javaforge.jqwicket.ui.uniform;

import net.javaforge.jqwicket.Utils;
import net.javaforge.jqwicket.ui.JQComponentBehaivor;

/**
 * @author mkalina
 * 
 */
public abstract class AbstractUniformBehavior extends
		JQComponentBehaivor<UniformOptions> implements IUniform {

	private static final long serialVersionUID = 1L;

	private static final String JQ_COMPONENT_NAME = "uniform";

	public AbstractUniformBehavior() {
		this(new UniformOptions());
	}

	public AbstractUniformBehavior(UniformOptions options) {

		super(options);
		if (Utils.isDevelopmentMode())
			addJsResourceReferences(JS_RESOURCE);
		else
			addJsResourceReferences(JS_RESOURCE_MIN);

		this.addCssResourceReferences(options.cssResourceReferences());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.javaforge.jqwicket.JQWidget#getName()
	 */
	public String getName() {
		return JQ_COMPONENT_NAME;
	}

}