<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<%@taglib prefix="rich" uri="http://richfaces.org/rich"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulta de Funcionários Cadastrados</title>
</head>
<body>
	
	<f:view>
		<jsp:include page="/menu.jsp" />
		
		<h:form>
			<h:panelGrid columns="1">
				<h:messages />
			</h:panelGrid>
			
			<h:panelGrid columns="3">
				<h:outputText value="Nome:" />
				<h:inputText value="#{funcionarioBacking.nomePesquisar}" maxlength="45" size="45"/>
				<h:commandButton action="#{funcionarioBacking.pesquisar}" value="Pesquisar" />
			</h:panelGrid>
			
			<h:panelGrid columns="1" width="450">
				<rich:dataTable id="tabFilmes" width="100%" value="#{funcionarioBacking.listaFuncionarios}" var="funcionario">
					<f:facet name="caption">
						<h:outputText value="Funcionários Cadastrados" />
					</f:facet>
					
					<f:facet name="header">
						<rich:columnGroup>
							<rich:column>
								<h:outputText value="Código" />
							</rich:column>
							<rich:column>
								<h:outputText value="Nome" />
							</rich:column>
							<rich:column>
								<h:outputText value="Perfil Acesso" />
							</rich:column>
							<rich:column>
								<h:outputText value="Celular" />
							</rich:column>
							<rich:column>
								<h:outputText value="E-mail" />
							</rich:column>
							<rich:column colspan="2">
								<h:outputText value="Ações" />
							</rich:column>
						</rich:columnGroup>
					</f:facet>
					
					<rich:column>
						<h:outputText value="#{funcionario.idFuncionario}" />
					</rich:column>
					<rich:column>
						<h:outputText value="#{funcionario.nome}" />
					</rich:column>
					<rich:column>
						<h:outputText value="#{funcionario.perfilAcesso}" />
					</rich:column>
					<rich:column>
						<h:outputText value="#{funcionario.contatoIdContato.celular}" />
					</rich:column>
					<rich:column>
						<h:outputText value="#{funcionario.contatoIdContato.email}" />
					</rich:column>
					
					<rich:column>
						<h:commandLink action="#{funcionarioBacking.alterar}" value="Alterar">
							<f:setPropertyActionListener value="#{funcionario}" target="#{funcionarioBacking.funcionarioSelecionado}" />
						</h:commandLink>
					</rich:column>
					
					<rich:column>
						<h:commandLink action="#{funcionarioBacking.excluir}" value="Excluir">
							<f:setPropertyActionListener value="#{funcionario}" target="#{funcionarioBacking.funcionarioSelecionado}" />
						</h:commandLink>
					</rich:column>
					
				</rich:dataTable>
			</h:panelGrid>
			
		</h:form>
		
	</f:view>
	
</body>
</html>