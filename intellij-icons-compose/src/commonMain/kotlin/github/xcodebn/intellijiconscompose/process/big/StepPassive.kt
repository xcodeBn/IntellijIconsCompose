package github.xcodebn.intellijiconscompose.process.big

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StepPassive: ImageVector
    get() {
        if (_StepPassive != null) return _StepPassive!!

        _StepPassive = ImageVector.Builder(
            name = "StepPassive",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f
        ).apply {

        }.build()

        return _StepPassive!!
    }

private var _StepPassive: ImageVector? = null

