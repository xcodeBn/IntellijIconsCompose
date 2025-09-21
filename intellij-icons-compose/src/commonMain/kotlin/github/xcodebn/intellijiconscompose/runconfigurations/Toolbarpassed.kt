package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Toolbarpassed: ImageVector
    get() {
        if (_Toolbarpassed != null) return _Toolbarpassed!!

        _Toolbarpassed = ImageVector.Builder(
            name = "Toolbarpassed",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF59A869)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 12f)
                lineTo(12f, 1f)
                lineTo(9f, 1f)
                lineTo(9f, 9f)
                lineTo(5f, 9f)
                lineTo(5f, 12f)
                close()
            }
        }.build()

        return _Toolbarpassed!!
    }

private var _Toolbarpassed: ImageVector? = null

