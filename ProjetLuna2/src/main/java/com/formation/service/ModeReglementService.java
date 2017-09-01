package com.formation.service;

import java.util.List;

import com.formation.domain.Article;
import com.formation.domain.ModeReglements;

public interface ModeReglementService {
	public void createModeReglement(ModeReglements modeReglement);
	public void deleteModeReglement(long  id);
	public void updateModeReglement(ModeReglements modeReglement);
	public List<ModeReglements> getListModeReglement();
	public ModeReglements find(long id);
}
