<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Alteração de Funcionários</title>
</head>
<body>

	<f:view>
		
		<jsp:include page="/menu.jsp" />
		
		<h:form>
		
			<h1>Alteração de Funcionários</h1>
			
			<h:panelGrid columns="1">
				<h:messages />
			</h:panelGrid>
	
			<h:panelGrid columns="2">
			
				<h:outputText value="Nome:" />
				<h:inputText value="#{funcionarioBacking.nome}" maxlength="45" size="45"/>
			
				<h:outputText value="CPF:" />
				<h:inputText value="#{funcionarioBacking.cpf}" maxlength="15" size="15"/>
				
				<h:outputText value="RG:" />
				<h:inputText value="#{funcionarioBacking.rg}" maxlength="15" size="15"/>
				
				<h:outputText value="Data Nascimento:" />
				<h:inputText value="#{funcionarioBacking.dataNascimento}" maxlength="8" size="15"/>
				
				<h:outputText value="Idade:" />
				<h:inputText value="#{funcionarioBacking.idade}" maxlength="8" size="15"/>
				
				<h:outputText value="Sexo:" />
				<h:selectOneRadio value="#{funcionarioBacking.sexo}">
					<f:selectItem itemValue="Masculino" itemLabel="Masculino"/>
					<f:selectItem itemValue="Feminino" itemLabel="Feminino"/>
				</h:selectOneRadio>
				
				<h:outputText value="Login:" />
				<h:inputText value="#{funcionarioBacking.login}" maxlength="8" size="15"/>
				
				<h:outputText value="Senha:" />
				<h:inputText value="#{funcionarioBacking.senha}" maxlength="8" size="15"/>
				
				<h:outputText value="Perfil Acesso:" />
				<h:inputText value="#{funcionarioBacking.perfilAcesso}" maxlength="8" size="15"/>
				
				<h:outputText value="Telefone:" />
				<h:inputText value="#{funcionarioBacking.telefone}" maxlength="8" size="15"/>
				
				<h:outputText value="Celular:" />
				<h:inputText value="#{funcionarioBacking.celular}" maxlength="8" size="15"/>
				
				<h:outputText value="E-mail:" />
				<h:inputText value="#{funcionarioBacking.email}" maxlength="8" size="15"/>
				
				<h:outputText value="Tipo Logradouro:" />
				<h:inputText value="#{funcionarioBacking.tipoLogradouro}" maxlength="8" size="15"/>
				
				<h:outputText value="Endereço:" />
				<h:inputText value="#{funcionarioBacking.enderec}" maxlength="8" size="15"/>
				
				<h:outputText value="Número:" />
				<h:inputText value="#{funcionarioBacking.numero}" maxlength="8" size="15"/>
				
				<h:outputText value="Complemento:" />
				<h:inputText value="#{funcionarioBacking.complemento}" maxlength="8" size="15"/>
				
				<h:outputText value="Bairro:" />
				<h:inputText value="#{funcionarioBacking.bairro}" maxlength="8" size="15"/>
				
				<h:outputText value="CEP:" />
				<h:inputText value="#{funcionarioBacking.cep}" maxlength="8" size="15"/>
				
				<h:outputText value="Estado:" />
				<rich:comboBox value="#{funcionarioBacking.estado}" suggestionValues="#{funcionarioBacking.listaE}" defaultLabel="-Selecione Estado-" onselect=""></rich:comboBox>
				
				<h:outputText value="Cidade:" />
				<rich:comboBox value="#{funcionarioBacking.cidade}" suggestionValues="#{funcionarioBacking.listaC}" defaultLabel="-Selecione Cidade-"></rich:comboBox>
				
			</h:panelGrid>
			
			<h:panelGrid columns="3">
				<h:commandButton action="#{funcionarioBacking.alterarFuncionario}" value="Alterar" />
				<h:commandButton action="#{funcionarioBacking.cancelar}" value="Cancelar" />
				<h:commandButton action="#{funcionarioBacking.sair}" value="Sair" />
			</h:panelGrid>
		</h:form>
	
	</f:view>
	
</body>
</html>