package github.xcodebn.intellijiconscompose.icons.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Nextstep: ImageVector
    get() {
        if (_Nextstep != null) return _Nextstep!!

        _Nextstep = ImageVector.Builder(
            name = "Nextstep",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(9f, 6f)
                lineTo(3f, 10f)
                lineTo(3f, 2f)
                lineTo(9f, 6f)
                close()
            }
        }.build()

        return _Nextstep!!
    }

private var _Nextstep: ImageVector? = null

