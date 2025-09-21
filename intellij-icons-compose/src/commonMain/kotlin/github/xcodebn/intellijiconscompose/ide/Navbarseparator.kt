package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Navbarseparator: ImageVector
    get() {
        if (_Navbarseparator != null) return _Navbarseparator!!

        _Navbarseparator = ImageVector.Builder(
            name = "Navbarseparator",
            defaultWidth = 5.0.dp,
            defaultHeight = 15.0.dp,
            viewportWidth = 5.0f,
            viewportHeight = 15.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 0f)
                lineTo(5f, 8f)
                lineTo(1f, 15f)
                lineTo(0f, 15f)
                lineTo(4f, 8f)
                lineTo(0f, 0f)
                close()
            }
        }.build()

        return _Navbarseparator!!
    }

private var _Navbarseparator: ImageVector? = null

