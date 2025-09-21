package github.xcodebn.intellijiconscompose.icons.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Menuarrow: ImageVector
    get() {
        if (_Menuarrow != null) return _Menuarrow!!

        _Menuarrow = ImageVector.Builder(
            name = "Menuarrow",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF808080)),
                strokeLineWidth = 1.3f
            ) {
                moveTo(5f, 2f)
                lineTo(9f, 6f)
                lineTo(5f, 10f)
            }
        }.build()

        return _Menuarrow!!
    }

private var _Menuarrow: ImageVector? = null

