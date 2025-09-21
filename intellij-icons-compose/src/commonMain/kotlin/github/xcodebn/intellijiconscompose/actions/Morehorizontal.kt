package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Morehorizontal: ImageVector
    get() {
        if (_Morehorizontal != null) return _Morehorizontal!!

        _Morehorizontal = ImageVector.Builder(
            name = "Morehorizontal",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _Morehorizontal!!
    }

private var _Morehorizontal: ImageVector? = null

