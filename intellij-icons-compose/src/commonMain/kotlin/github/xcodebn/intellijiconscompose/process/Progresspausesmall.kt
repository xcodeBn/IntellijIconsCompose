package github.xcodebn.intellijiconscompose.process

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Progresspausesmall: ImageVector
    get() {
        if (_Progresspausesmall != null) return _Progresspausesmall!!

        _Progresspausesmall = ImageVector.Builder(
            name = "Progresspausesmall",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {

        }.build()

        return _Progresspausesmall!!
    }

private var _Progresspausesmall: ImageVector? = null

