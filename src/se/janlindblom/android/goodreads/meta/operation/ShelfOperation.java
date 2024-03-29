/**
 * 
 */
package se.janlindblom.android.goodreads.meta.operation;

/**
 * $Id:$
 * 
 * Copyright (c) 2009, Jan Lindblom
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of the project nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 */

import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.XMLReader;

import se.janlindblom.android.goodreads.meta.Operation;
import se.janlindblom.android.goodreads.meta.Response;
import se.janlindblom.android.goodreads.request.ShelfHandler;

/**
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 * @version 0.1
 */
public class ShelfOperation implements Operation {
	private String showURLBase;
	private URL showURL;
	private String key = null;
	private String shelf = null;
	private int id = 0;
	
	public ShelfOperation() {
		this.setShowURLBase("http://www.goodreads.com/review/list/");
	}
	
	public ShelfOperation(String key) {
		this();
		this.setKey(key);
	}
	
	public ShelfOperation(String key, int id) {
		this(key);
		this.setId(id);
	}
	
	public ShelfOperation(String key, String shelf) {
		this(key);
		this.setShelf(shelf);
	}
	
	public ShelfOperation(String key, int id, String shelf) {
		this(key, id);
		this.setShelf(shelf);
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.android.goodreads.meta.Operation#execute()
	 */
	@Override
	public Response execute() {
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser sp;
		XMLReader xr;
		ShelfHandler sh;
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see se.janlindblom.android.goodreads.meta.Operation#getType()
	 */
	@Override
	public int getType() {
		return Operation.OPERATION_SHELF;
	}

	/**
	 * @param showURLBase the showURLBase to set
	 */
	public void setShowURLBase(String showURLBase) {
		this.showURLBase = showURLBase;
	}

	/**
	 * @return the showURLBase
	 */
	public String getShowURLBase() {
		return showURLBase;
	}

	/**
	 * @param showURL the showURL to set
	 */
	public void setShowURL(URL showURL) {
		this.showURL = showURL;
	}

	/**
	 * @return the showURL
	 */
	public URL getShowURL() {
		return showURL;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param shelf the shelf to set
	 */
	public void setShelf(String shelf) {
		this.shelf = shelf;
	}

	/**
	 * @return the shelf
	 */
	public String getShelf() {
		return shelf;
	}

}
