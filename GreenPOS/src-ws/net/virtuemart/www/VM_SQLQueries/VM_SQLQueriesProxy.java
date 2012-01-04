package net.virtuemart.www.VM_SQLQueries;

public class VM_SQLQueriesProxy implements net.virtuemart.www.VM_SQLQueries.VM_SQLQueries_PortType {
  private String _endpoint = null;
  private net.virtuemart.www.VM_SQLQueries.VM_SQLQueries_PortType vM_SQLQueries_PortType = null;
  
  public VM_SQLQueriesProxy() {
    _initVM_SQLQueriesProxy();
  }
  
  public VM_SQLQueriesProxy(String endpoint) {
    _endpoint = endpoint;
    _initVM_SQLQueriesProxy();
  }
  
  private void _initVM_SQLQueriesProxy() {
    try {
      vM_SQLQueries_PortType = (new net.virtuemart.www.VM_SQLQueries.VM_SQLQueries_ServiceLocator()).getVM_SQLQueriesSOAP();
      if (vM_SQLQueries_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)vM_SQLQueries_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)vM_SQLQueries_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (vM_SQLQueries_PortType != null)
      ((javax.xml.rpc.Stub)vM_SQLQueries_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.virtuemart.www.VM_SQLQueries.VM_SQLQueries_PortType getVM_SQLQueries_PortType() {
    if (vM_SQLQueries_PortType == null)
      _initVM_SQLQueriesProxy();
    return vM_SQLQueries_PortType;
  }
  
  public net.virtuemart.www.VM_SQLQueries.SQLResult[] executeSQLQuery(net.virtuemart.www.VM_SQLQueries.SQLRequest parameters) throws java.rmi.RemoteException{
    if (vM_SQLQueries_PortType == null)
      _initVM_SQLQueriesProxy();
    return vM_SQLQueries_PortType.executeSQLQuery(parameters);
  }
  
  public net.virtuemart.www.VM_SQLQueries.SQLResult[] executeSQLSelectQuery(net.virtuemart.www.VM_SQLQueries.SQLSelectRequest parameters) throws java.rmi.RemoteException{
    if (vM_SQLQueries_PortType == null)
      _initVM_SQLQueriesProxy();
    return vM_SQLQueries_PortType.executeSQLSelectQuery(parameters);
  }
  
  public net.virtuemart.www.VM_SQLQueries.SQLResult[] executeSQLInsertQuery(net.virtuemart.www.VM_SQLQueries.SQLInsertRequest parameters) throws java.rmi.RemoteException{
    if (vM_SQLQueries_PortType == null)
      _initVM_SQLQueriesProxy();
    return vM_SQLQueries_PortType.executeSQLInsertQuery(parameters);
  }
  
  public net.virtuemart.www.VM_SQLQueries.SQLResult[] executeSQLUpdateQuery(net.virtuemart.www.VM_SQLQueries.SQLUpdateRequest parameters) throws java.rmi.RemoteException{
    if (vM_SQLQueries_PortType == null)
      _initVM_SQLQueriesProxy();
    return vM_SQLQueries_PortType.executeSQLUpdateQuery(parameters);
  }
  
  
}