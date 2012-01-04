@echo off

cd .
set file=ticket.txt
echo %file%

:loop

if exist "%file%" (
echo. File Exists
Attrib -s -h %file%

for /f "tokens=*" %%A in (%file%) do (
if %%A==-----*CUT*----- (
for /f "tokens=*" %%A in (CUTRECEIPT) do (
echo %AA 
)
) else (
echo %%A >>COM1
)
)
DEL %file%
) else (
echo. *
)
PING 1.1.1.1 -n 1 -w 2000 >NUL

goto loop


pause