/*
 Copyright (C) 2013 Choucri FAHED

 This source code is release under the BSD License.

 This file is part of QuantScale, a free-software/open-source library
 for financial quantitative analysts and developers - 
 http://github.com/choucrifahed/quantscale

 QuantScale is free software: you can redistribute it and/or modify it
 under the terms of the QuantScale license.  You should have received a
 copy of the license along with this program; if not, please email
 <choucri.fahed@mines-nancy.org>.

 This program is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE.  See the license for more details.

 QuantScale is based on QuantLib. http://quantlib.org/
 When applicable, the original copyright notice follows this notice.
 */
/*
 Copyright (C) 2002, 2003 Ferdinando Ametrano
 Copyright (C) 2000, 2001, 2002, 2003 RiskMap srl
 Copyright (C) 2007 StatPro Italia srl

 This file is part of QuantLib, a free-software/open-source library
 for financial quantitative analysts and developers - http://quantlib.org/

 QuantLib is free software: you can redistribute it and/or modify it
 under the terms of the QuantLib license.  You should have received a
 copy of the license along with this program; if not, please email
 <quantlib-dev@lists.sf.net>. The license is also available online at
 <http://quantlib.org/license.shtml>.

 This program is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE.  See the license for more details.
*/

package org.qslib.quantscale

import scala.util.Try
import org.joda.time.DateTime
import org.qslib.quantscale.pattern.Observable
import org.qslib.quantscale.pattern.Observer
import scala.concurrent.Future

/**
 * Interface for pricing engines.
 *
 * @author Choucri FAHED
 * @since 1.0
 */
trait PricingEngine {
  type InstrumentType <: Instrument

  def calculate(instrument: InstrumentType): Future[instrument.ResultsType]
}

/** Generic trait for results returned by a pricing engine */
trait Results {

  /** Either Money or Real */
  type ValueType

  def value(): ValueType
  def errorEstimate: Option[ValueType]
  def valuationDate: DateTime
  def additionalResults: Map[String, Any]

  /**
   * @return any additional result returned by the pricing engine.
   */
  final def get(tag: String): Option[Any] = additionalResults get tag
}
