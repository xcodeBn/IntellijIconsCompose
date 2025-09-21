package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Balloon: ImageVector
    get() {
        if (_Balloon != null) return _Balloon!!

        _Balloon = ImageVector.Builder(
            name = "Balloon",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(11f, 12f)
                lineTo(15f, 6f)
                lineTo(15f, 15f)
                close()
            }
        }.build()

        return _Balloon!!
    }

private var _Balloon: ImageVector? = null

