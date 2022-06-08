package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringTest {

	@Test
	void replace() {
		String actual = "abc".replace("b", "d");
		assertThat(actual).isEqualTo("adc");
	}

	@Test
	void split() {
		String[] actual = "1,2".split(",");

		assertThat(actual).contains("1");
		assertThat(actual).containsExactly("1", "2");
	}
}
