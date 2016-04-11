package org.witchcraft.base.entity;

import org.hibernate.envers.RevisionListener;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class CustomRevisionListener implements RevisionListener {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void newRevision(final Object revisionEntity) {
		final Revision revision = (Revision) revisionEntity;

		final Authentication auth = SecurityContextHolder.getContext()
				.getAuthentication();

		if (auth != null) {
			// save the user name
			revision.setUserName(auth.getName());

			/*
			Object details = auth.getDetails();
			if (details != null
					&& details instanceof CustomWebAuthenticationDetails) {
				// save the user IP
				revision.setRemoteIp(((CustomWebAuthenticationDetails) details)
						.getRemoteIp());
			}*/
		}

	}
}