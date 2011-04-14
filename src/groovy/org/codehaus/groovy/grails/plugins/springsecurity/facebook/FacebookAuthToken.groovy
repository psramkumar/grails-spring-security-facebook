package org.codehaus.groovy.grails.plugins.springsecurity.facebook

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.Authentication
import org.springframework.security.authentication.AbstractAuthenticationToken

public class FacebookAuthToken extends AbstractAuthenticationToken implements Authentication {
	
	long uid
	String secret
	String session
	
	Collection<GrantedAuthority> authorities
	
	def FacebookAuthToken() {
		super([] as Collection<GrantedAuthority>);
	}	

	public Object getCredentials() {
		return uid;
	}

	public Object getPrincipal() {
		return getDetails();
	}
	
}