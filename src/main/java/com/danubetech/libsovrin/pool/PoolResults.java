package com.danubetech.libsovrin.pool;

import com.danubetech.libsovrin.SovrinJava;

/**
 * pool.rs Results
 */
public final class PoolResults {

	private PoolResults() {

	}

	public static class CreatePoolLedgerConfigResult extends SovrinJava.Result {

		CreatePoolLedgerConfigResult() { }
	}

	public static class OpenPoolLedgerResult extends SovrinJava.Result {

		private Pool pool;
		OpenPoolLedgerResult(Pool pool) { this.pool = pool; }
		public Pool getPool() { return this.pool; }
	}

	public static class RefreshPoolLedgerResult extends SovrinJava.Result {

		RefreshPoolLedgerResult() { }
	}

	public static class ClosePoolLedgerResult extends SovrinJava.Result {

		ClosePoolLedgerResult() { }
	}

	public static class DeletePoolLedgerConfigResult extends SovrinJava.Result {

		DeletePoolLedgerConfigResult() { }
	}
}
