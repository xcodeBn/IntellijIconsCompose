package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Entrypoints: ImageVector
    get() {
        if (_Entrypoints != null) return _Entrypoints!!

        _Entrypoints = ImageVector.Builder(
            name = "Entrypoints",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 7f)
                lineTo(9f, 7f)
                lineTo(9f, 2f)
                lineTo(7f, 2f)
                lineTo(7f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 9f)
                lineTo(7f, 9f)
                lineTo(7f, 14f)
                lineTo(9f, 14f)
                lineTo(9f, 9f)
                lineTo(14f, 9f)
                close()
            }
        }.build()

        return _Entrypoints!!
    }

private var _Entrypoints: ImageVector? = null

