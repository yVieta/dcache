package org.dcache.webadmin.model.dataaccess;

import org.dcache.webadmin.model.exceptions.DAOException;

/**
 * The instantiation of DAOs is abstracted this way to make Unittests with
 * Helper DAOs/DAO-Factories possible.
 * @author jan schaefer 29-10-2009
 */
public interface DAOFactory {

    public PoolsDAO getPoolsDAO() throws DAOException;
    public void setDefaultXMLDataGatherer(XMLDataGatherer xmlDataGatherer);
}
