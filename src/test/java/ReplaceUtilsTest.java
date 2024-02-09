import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.pyetro.utils.ReplaceUtils;

public class ReplaceUtilsTest {

	@Test
	public void replaceCPF() {
		String cpf = "111.111.111-22";
		String newCpf = ReplaceUtils.replace(cpf, ".", "-");
		
		assertEquals(newCpf, "11111111122");
	}
	
	@Test
	public void replaceTel() {
		String tel = "(83) 99999-0000";
		String newtel = ReplaceUtils.replace(tel, "(", ")", " ", "-");
		
		assertEquals(newtel, "83999990000");
	}
}