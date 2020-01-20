cmd /C start/MIN java -jar selenium-server-standalone-3.141.59.jar -role hub
cmd /C start/MIN java -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register -port 5557 -browser browserName=chrome
cmd /C start/MIN java -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register -port 5558 -browser browserName=firefox