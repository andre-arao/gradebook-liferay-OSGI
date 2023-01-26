/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.andre.gradebook.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AssignmentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssignmentLocalService
 * @generated
 */
public class AssignmentLocalServiceWrapper
	implements AssignmentLocalService, ServiceWrapper<AssignmentLocalService> {

	public AssignmentLocalServiceWrapper() {
		this(null);
	}

	public AssignmentLocalServiceWrapper(
		AssignmentLocalService assignmentLocalService) {

		_assignmentLocalService = assignmentLocalService;
	}

	/**
	 * Adds the assignment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignment the assignment
	 * @return the assignment that was added
	 */
	@Override
	public com.liferay.andre.gradebook.model.Assignment addAssignment(
		com.liferay.andre.gradebook.model.Assignment assignment) {

		return _assignmentLocalService.addAssignment(assignment);
	}

	@Override
	public Assiginment addAssignment(
			long groupId, String title, String description, Date dueDate,
			ServicContext servicContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignmentLocalService.addAssignment(
			groupId, title, description, dueDate, servicContext);
	}

	/**
	 * Creates a new assignment with the primary key. Does not add the assignment to the database.
	 *
	 * @param assignment the primary key for the new assignment
	 * @return the new assignment
	 */
	@Override
	public com.liferay.andre.gradebook.model.Assignment createAssignment(
		long assignment) {

		return _assignmentLocalService.createAssignment(assignment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignmentLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the assignment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignment the assignment
	 * @return the assignment that was removed
	 */
	@Override
	public com.liferay.andre.gradebook.model.Assignment deleteAssignment(
		com.liferay.andre.gradebook.model.Assignment assignment) {

		return _assignmentLocalService.deleteAssignment(assignment);
	}

	/**
	 * Deletes the assignment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignment the primary key of the assignment
	 * @return the assignment that was removed
	 * @throws PortalException if a assignment with the primary key could not be found
	 */
	@Override
	public com.liferay.andre.gradebook.model.Assignment deleteAssignment(
			long assignment)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignmentLocalService.deleteAssignment(assignment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignmentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _assignmentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _assignmentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assignmentLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _assignmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.andre.gradebook.model.impl.AssignmentModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _assignmentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.andre.gradebook.model.impl.AssignmentModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _assignmentLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _assignmentLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _assignmentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.andre.gradebook.model.Assignment fetchAssignment(
		long assignment) {

		return _assignmentLocalService.fetchAssignment(assignment);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _assignmentLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the assignment with the primary key.
	 *
	 * @param assignment the primary key of the assignment
	 * @return the assignment
	 * @throws PortalException if a assignment with the primary key could not be found
	 */
	@Override
	public com.liferay.andre.gradebook.model.Assignment getAssignment(
			long assignment)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignmentLocalService.getAssignment(assignment);
	}

	@Override
	public java.util.List<com.liferay.andre.gradebook.model.Assignment>
		getAssignmentByGroupId(long groupId) {

		return _assignmentLocalService.getAssignmentByGroupId(groupId);
	}

	@Override
	public java.util.List<com.liferay.andre.gradebook.model.Assignment>
		getAssignmentByGroupId(long groupId, int start, int end) {

		return _assignmentLocalService.getAssignmentByGroupId(
			groupId, start, end);
	}

	@Override
	public java.util.List<com.liferay.andre.gradebook.model.Assignment>
		getAssignmentByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.andre.gradebook.model.Assignment>
					orderByComparator) {

		return _assignmentLocalService.getAssignmentByGroupId(
			groupId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.andre.gradebook.model.Assignment>
		getAssignmentByKeywords(
			long groupId, String keywords, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.andre.gradebook.model.Assignment>
					orderByComparator) {

		return _assignmentLocalService.getAssignmentByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	@Override
	public Long getAssignmentCountByKeywords(long groupId, String keywords) {
		return _assignmentLocalService.getAssignmentCountByKeywords(
			groupId, keywords);
	}

	/**
	 * Returns a range of all the assignments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.andre.gradebook.model.impl.AssignmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assignments
	 * @param end the upper bound of the range of assignments (not inclusive)
	 * @return the range of assignments
	 */
	@Override
	public java.util.List<com.liferay.andre.gradebook.model.Assignment>
		getAssignments(int start, int end) {

		return _assignmentLocalService.getAssignments(start, end);
	}

	/**
	 * Returns the number of assignments.
	 *
	 * @return the number of assignments
	 */
	@Override
	public int getAssignmentsCount() {
		return _assignmentLocalService.getAssignmentsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _assignmentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _assignmentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assignmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the assignment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssignmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assignment the assignment
	 * @return the assignment that was updated
	 */
	@Override
	public com.liferay.andre.gradebook.model.Assignment updateAssignment(
		com.liferay.andre.gradebook.model.Assignment assignment) {

		return _assignmentLocalService.updateAssignment(assignment);
	}

	@Override
	public AssignmentLocalService getWrappedService() {
		return _assignmentLocalService;
	}

	@Override
	public void setWrappedService(
		AssignmentLocalService assignmentLocalService) {

		_assignmentLocalService = assignmentLocalService;
	}

	private AssignmentLocalService _assignmentLocalService;

}