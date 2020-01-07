package weedem;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@ApplicationPath("/api")
//atributo version definido para 'api'. O atributo eh obrigatorio e forcosamente entra na url de cadastramento do wso2.
//No nosso caso, estamos versionando as apis diretamente nas anotacoes swagger de cada metodo, e a especificacao enviada aos
//agentes financeiros nos obriga a ter o termo 'api' antes do numero de versao.
@SwaggerDefinition(
        info = @Info(description = "Serviços para Cobranca do Credito Compartilhado",
                     version = "api",
                     title = "Servicos Cobranca Credito Compartilhado"),
        tags= {@Tag(name="CCC API", 
                    description="APIs para Cobranca Credito Compartilhado")})
public class RestRoot extends Application 
{
}

