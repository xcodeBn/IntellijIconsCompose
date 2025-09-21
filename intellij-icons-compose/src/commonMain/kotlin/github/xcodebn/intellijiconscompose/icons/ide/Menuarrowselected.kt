package github.xcodebn.intellijiconscompose.icons.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Menuarrowselected: ImageVector
    get() {
        if (_Menuarrowselected != null) return _Menuarrowselected!!

        _Menuarrowselected = ImageVector.Builder(
            name = "Menuarrowselected",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFFFFFFFF)),
                strokeLineWidth = 1.3f
            ) {
                moveTo(5f, 2f)
                lineTo(9f, 6f)
                lineTo(5f, 10f)
            }
        }.build()

        return _Menuarrowselected!!
    }

private var _Menuarrowselected: ImageVector? = null

