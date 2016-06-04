import re
import time

line = 'tengo  años'

regex_1 = r'([A-Z][a-zA-z]+)'
regex_2 = r'([0-9]{1,2}){1}'
regex_3 = r'(\bradio\b|\bspotify\b|\byoutube\b|\breproductor\b|\bdeezer\b)'
regex_4 = r'(\bsi\b|\bno\b)'
regex_5 = r'(\bguitarra\b|\bbajo\b|\bbateria\b|\bviolin\b|\bpiano\b|\bteclado\b|\bcello\b)'
regex_6 = r'(\britmo\b|\bletra\b|\bmelodia\b|\bnombre\b)'

def examinar_respuesta(regex, respuesta):

    resultado_match = re.search(regex, respuesta)
    resultado_final = None

    if resultado_match != None:
        resultado_final = resultado_match.group()
        return resultado_final
    else:
        resultado_final = False
        return resultado_final

print(examinar_respuesta(regex_2, line))
## dd/mm/yyyy format

def fecha_de_nacimiento(edad):
    if edad != None:
        return (int(time.strftime("%Y")) - int(edad))


print (fecha_de_nacimiento(examinar_respuesta(regex_2, line)))