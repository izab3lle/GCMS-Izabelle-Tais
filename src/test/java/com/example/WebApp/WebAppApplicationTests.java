package com.example.WebApp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/"))
						.andDo(print()).andExpect(status().isOk())
						.andExpect(content()
								.string(containsString("Hello, World!")));
	}
	
	@Test
	public void shouldReturnName() throws Exception {
		this.mockMvc.perform(get("/izabelle"))
						.andDo(print()).andExpect(status().isOk())
						.andExpect(content()
								.string(containsString("Hello, Izabelle!")));
	}
	
	@Test
	public void shouldReturnGlub() throws Exception {
		this.mockMvc.perform(get("/axolotl"))
						.andDo(print()).andExpect(status().isOk())
						.andExpect(content()
								.string(containsString("glub glob glub!")));
	}
	
	@Test
	public void shouldReturnLorem() throws Exception {
		this.mockMvc.perform(get("/lorem"))
						.andDo(print()).andExpect(status().isOk())
						.andExpect(content()
								.string(containsString("Lorem ipsum")));
	}

	@Test
	public void shouldReturnBox() throws Exception {
		this.mockMvc.perform(get("/box"))
						.andDo(print()).andExpect(status().isOk())
						.andExpect(content()
								.string(containsString("What's in the box?")));
	}
	
	@Test
	public void shouldReturnPar() throws Exception {
		this.mockMvc.perform(get("/parOuImpar/12"))
						.andDo(print()).andExpect(status().isOk())
						.andExpect(content()
								.string(containsString("12 é par")));
	}
	
	@Test
	public void shouldReturnImpar() throws Exception {
		this.mockMvc.perform(get("/parOuImpar/33"))
						.andDo(print()).andExpect(status().isOk())
						.andExpect(content()
								.string(containsString("33 é ímpar")));
	}
	
	public void shouldReturnHotfix() throws Exception {
		this.mockMvc.perform(get("/hotfix"))
						.andDo(print()).andExpect(status().isOk())
						.andExpect(content()
								.string(containsString("Hello, hotfix!")));

	}
}
