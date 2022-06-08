package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
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

	@Test
	void substring() {
		String actual = "(1,2)".substring(1, 5);

		assertThat(actual).contains("1,2");
	}

	@DisplayName("charAt() 메서드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 IndexOutOfBoundException 발생")
	@Test
	void charAt() {
		assertThatThrownBy(() -> {
			char actual = "abc".charAt(3);
		}).isInstanceOf(StringIndexOutOfBoundsException.class)
			.hasMessageContaining("String index out of range: 3");
	}
}
