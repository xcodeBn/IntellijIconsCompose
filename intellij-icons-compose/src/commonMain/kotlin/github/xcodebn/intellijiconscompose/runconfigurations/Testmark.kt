package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Testmark: ImageVector
    get() {
        if (_Testmark != null) return _Testmark!!

        _Testmark = ImageVector.Builder(
            name = "Testmark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(16f, 4f)
                lineTo(12f, 7f)
                lineTo(12f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(8f, 4f)
                lineTo(11f, 0f)
                lineTo(11f, 7f)
                close()
            }
        }.build()

        return _Testmark!!
    }

private var _Testmark: ImageVector? = null

