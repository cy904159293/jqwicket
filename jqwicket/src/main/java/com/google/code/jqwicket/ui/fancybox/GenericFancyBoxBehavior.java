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
package com.google.code.jqwicket.ui.fancybox;

import com.google.code.jqwicket.ui.GenericJQComponentBehaivor;

/**
 * @author mkalina
 * 
 */
public class GenericFancyBoxBehavior extends
		GenericJQComponentBehaivor<FancyBoxOptions> implements IFancyBox {

	private static final long serialVersionUID = 1L;

	public GenericFancyBoxBehavior(CharSequence selector) {
		this(selector, new FancyBoxOptions());
	}

	public GenericFancyBoxBehavior(CharSequence selector,
			FancyBoxOptions options) {
		super(selector, options);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jqwicket.IJQWidget#getName()
	 */
	public CharSequence getName() {
		return JQ_COMPONENT_NAME;
	}
}
