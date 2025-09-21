package github.xcodebn.intellijiconscompose.process

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StepMask: ImageVector
    get() {
        if (_StepMask != null) return _StepMask!!

        _StepMask = ImageVector.Builder(
            name = "StepMask",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _StepMask!!
    }

private var _StepMask: ImageVector? = null

