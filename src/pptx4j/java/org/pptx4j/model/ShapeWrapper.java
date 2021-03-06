/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */

package org.pptx4j.model;

import org.apache.log4j.Logger;
import org.docx4j.openpackaging.parts.PresentationML.JaxbPmlPart;
import org.pptx4j.pml.Shape;

public class ShapeWrapper {
	
	private static Logger log = Logger.getLogger(ShapeWrapper.class);		
	
	public ShapeWrapper(Shape sp, String phType, JaxbPmlPart owner) {
		this.sp = sp;
		this.phType = phType;
		this.owner = owner;
	}
	
	String phType;
	
	Shape sp;
	
	JaxbPmlPart owner;

	/**
	 * @return the phType
	 */
	public String getPhType() {
		return phType;
	}

	/**
	 * @return the shape itself
	 */
	public Shape getSp() {
		return sp;
	}

	/**
	 * @return the layout part in which this shape is defined 
	 */
	public JaxbPmlPart getOwner() {
		return owner;
	}
	


}
