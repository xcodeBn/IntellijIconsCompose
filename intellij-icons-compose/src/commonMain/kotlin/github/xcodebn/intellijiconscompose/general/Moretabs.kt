package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Moretabs: ImageVector
    get() {
        if (_Moretabs != null) return _Moretabs!!

        _Moretabs = ImageVector.Builder(
            name = "Moretabs",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(4f, 7f)
                lineTo(6f, 10f)
                lineTo(1f, 10f)
                close()
            }
        }.build()

        return _Moretabs!!
    }

private var _Moretabs: ImageVector? = null

