@echo off

REM    GreenPOS is a point of sales application designed for touch screens.
REM    Copyright (C) 2008-2009 Openbravo, S.L.
REM    http://code.google.com/p/openbravocustom/
REM
REM    This file is part of GreenPOS.
REM
REM    GreenPOS is free software: you can redistribute it and/or modify
REM    it under the terms of the GNU General Public License as published by
REM    the Free Software Foundation, either version 3 of the License, or
REM    (at your option) any later version.
REM
REM    GreenPOS is distributed in the hope that it will be useful,
REM    but WITHOUT ANY WARRANTY; without even the implied warranty of
REM    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
REM    GNU General Public License for more details.
REM
REM    You should have received a copy of the GNU General Public License
REM    along with GreenPOS.  If not, see <http://www.gnu.org/licenses/>.

set DIRNAME=%~dp0

set CP="%DIRNAME%openbravopos.jar"

set CP=%CP%;"%DIRNAME%locales/"
set CP=%CP%;"%DIRNAME%lib/substance.jar"

start /B javaw -cp %CP% com.openbravo.pos.config.JFrmConfig
