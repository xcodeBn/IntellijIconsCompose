package github.xcodebn.intellijiconscompose.icons.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Nextstepinverted: ImageVector
    get() {
        if (_Nextstepinverted != null) return _Nextstepinverted!!

        _Nextstepinverted = ImageVector.Builder(
            name = "Nextstepinverted",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(6f, 3f)
                lineTo(10f, 9f)
                lineTo(2f, 9f)
                close()
            }
        }.build()

        return _Nextstepinverted!!
    }

private var _Nextstepinverted: ImageVector? = null

