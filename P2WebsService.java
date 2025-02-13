package tycs;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
@WebService(serviceName = "TempConvert")
public class TempConvert {

    
    @WebMethod(operationName = "F_to_C")
    public Float F_to_C(@WebParam(name = "f") float f) {
        return ((f-32)*5/9);
    }
    @WebMethod(operationName = "C_to_F")
    public Float C_to_F(@WebParam(name = "c") float c) {
        //TODO write your implementation code here:
        return ((c*9/5)+32);
    }
    }


"""Add operation
Name: C_to_F 
Return type: float
Click add
Under parameters section
Name: c
Type: float
Ok

In the source code
(F_to_C section)
return ((f-32)*5/9); 
(C_to_F section)
return ((c*9/5)+32); 
(ctrl+s)

Right click on the project
Deploy
In the project one sub title is web services
Right click on web services 
Test web services"""
