package com.formation.dao;

import java.util.List;


import com.formation.domain.ModeReglements;

public interface ModeReglementDAO {

	public void createModeReglement(ModeReglements modeReglement);
	public void deleteModeReglement(long  id);
	public void updateModeReglement(ModeReglements modeReglement);
	public List<ModeReglements> getListModeReglement();
	
	
}
