# tarea-herencia-001

En el presente proyecto, usted debe subir los archivos en lenguaje de programación JAVA 

Problemática 
paquete personal
Clase Persona
	atributos:	
			nombres
			apellidos
			edad
			cedula

Clase Trabajador - hereda de Persona
	atributos:
			costo_seguro
			horas_trabajadas
			costo_por_hora
	métodos:
			obtener_sueldo ((horas x costo_hora)+costo_seguro)
					
paquete laempresa
clase Empresa
	atributos:
			nombre
			siglas
			ciudad
			trabajadores tipo Arreglo Trabajador
			
clase EmpresaPrivada - hereda de Empresa
	atributos:
			ventas_mensual_fijo
			numero_sucursales


Para todas las clases anteriores crear constructores, métodos establecer y obtener por cada atributo y sobrescribir el método toString

clase Principal
			método main
				- Crear un objeto EmpresaPrivada, que genere el siguiente reporte:
				
				Empresa: Soluciones Software
				Siglas: SS's
				Ciudad: Loja
				Ventas: $ 200000
				Sucursales: 12
				Lista Trabajadores:
					
				 	1) 	Ana Luisa Velez Alcivar
						30 años de edad
						CI: 12903939
						Seguro: $100
						Horas Trabajadas: 40
						Valor x Hora: $ 10
						Sueldo: 500
					2) 	Mario Anibal Vela Narvaez
						35 años de edad
						CI: 212889
						Seguro: $100
						Horas Trabajadas: 50
						Valor x Hora: $ 10
						Sueldo: 600