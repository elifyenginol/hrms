package kodlamaio.hrms.core.adapters.concretes;

import java.rmi.RemoteException;
import java.util.Locale;
import kodlamaio.hrms.core.adapters.abstracts.CheckService;
import kodlamaio.hrms.entities.concretes.Employee;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckService {

	@Override
	public boolean CheckIfRealPerson(Employee employee) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(employee.getIdentityNumber()),
					employee.getFirstName().toUpperCase(new Locale("tr")),
					employee.getLastName().toUpperCase(new Locale("tr")), employee.getDateOfBirth());

		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return result;
	}

}
